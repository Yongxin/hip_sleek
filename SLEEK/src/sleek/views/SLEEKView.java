package sleek.views;


import java.util.Vector;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.*;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class SLEEKView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "sleek.views.SLEEKView";

	//private TableViewer viewer;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	private StyledText viewer;
	private IDocument document;
	private String text;
	private Label label;
	private Vector<Integer> startandEnd;
	private Vector<Integer> entail = new Vector<Integer>();
	private Vector<Integer> listeners = new Vector<Integer>();
	private Vector<Integer> offsets = new Vector<Integer>();

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	/*class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	class NameSorter extends ViewerSorter {
	}*/

	/**
	 * The constructor.
	 */
	public SLEEKView() {
		viewer = null;
		//document = null;
		text = null;
		label = null;
		//entail = new Vector<Integer>();
	}
	
	public StyledText getViewer() {
		return viewer;
	}
	
	public void initialize() {
		text = getCurrentEditorContent();
	}
	
	public void initializeSelection() {
		text = getSelectedEditorContent();
	}
	
	public Vector<Integer> getEntailRange() {
		return entail;
	}
	
	public String getSelectedEditorContent() {
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
		    .getActiveEditor();
		if (!(editor instanceof ITextEditor)) return null;
		ITextEditor ite = (ITextEditor)editor;
		document = ite.getDocumentProvider().getDocument(ite.getEditorInput());
		String temp[] = document.get().split("\\s+");
		String save = "";
		for (int i=0;i<temp.length;i++) {
			if (!temp[i].equals("checkentail"))
			{
				save += temp[i];
				save += " ";
				if (temp[i].endsWith(".")||temp[i].endsWith("}"))
					save += "\n\n";
			}
			else
				break;
		}
		
		ITextSelection selection = (ITextSelection) editor.getEditorSite().getSelectionProvider().getSelection();
		
		if (selection.getLength()!=0) {
			save += selection.getText();
		
			entail.add(selection.getStartLine());
			entail.add(selection.getEndLine());
			//System.out.println("Initialized entail: "+entail.size());
		}
		else {
			//System.out.println("here");
			int lineNO = selection.getEndLine();
			entail.add(lineNO);
			entail.add(lineNO);
			
			String[] lines = document.get().split(System.getProperty("line.separator"));
			//System.out.println(lines.length);
			int start = 0;
			int end = 0;
			int i=0;
			
			for (i=0;i<lines.length;i++) {
				if (lines[i].trim().length()>0) {
					String[] subTemp = lines[i].split("\\s+");
					//System.out.println(subTemp.length + subTemp[0]+" i:"+i);
					if (subTemp[0].equals("checkentail")) {
	
						start = i;
						while (!subTemp[subTemp.length-1].endsWith(".")){
							i++;
							subTemp = lines[i].split("\\s+");
							//System.out.println("infinite loop");
						}
						end = i;
					}
					
					for (int j=i+1;j<lines.length;j++) {
						if (lines[j].trim().length()>0) {
							String[] subTemp2 = lines[j].split("\\s+");
							if (subTemp2[0].equals("checkentail"))
									break;
							else if (subTemp2[0].equals("print")) {
								while (!subTemp2[subTemp2.length-1].endsWith(".")){
									j++;
									subTemp2 = lines[j].split("\\s+");
									//System.out.println("infinite loop");
								}
								end = j;
							}
						}
					}
					
					if (start<=lineNO && end>=lineNO)
						break;
				}
				
			}
			//System.out.println("out break");
			
			if ((start<=lineNO)&&(end>=lineNO))
				for (i=start;i<=end;i++) {
					save += lines[i];
				}
			//System.out.printf(save);
		}
		
		return save;
	}
	
	public String getCurrentEditorContent() {
	    IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
	        .getActiveEditor();
	    if (!(editor instanceof ITextEditor)) return null;
	    ITextEditor ite = (ITextEditor)editor;
	    document = ite.getDocumentProvider().getDocument(ite.getEditorInput());
	    String[] lines = document.get().split(System.getProperty("line.separator"));
	    entail.add(0);
	    entail.add(lines.length);
	    return document.get();
	    
	}
	
	public IDocument getDocument() {
		IDocument tempDoc = new Document();
		tempDoc.set(text);
		return tempDoc;
	}
	
	public String getText() {
		return text;
	}
	
	public void setTextColor(Color color, int offset, int length, boolean redraws) {
		StyleRange styleRange = new StyleRange();
		styleRange.start = offset;
		styleRange.length = length;
		styleRange.fontStyle = SWT.BOLD;
		styleRange.foreground = color;
		viewer.setStyleRange(styleRange);
	}
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		/*viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "SLEEK.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();*/
		viewer = new StyledText(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL );
		//viewer.setText("Created");
		//viewer.set(getViewSite());
		//viewer.setDocument(document);
		
	}

	/*private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				SLEEKView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"SLEEK View",
			message);
	}*/

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
	
	public void setDocument(IDocument doc) {
		//viewer.setText("I reached before");
		viewer.setText(doc.get());
		//viewer.setText("I reached after");
	}
	
	public void clearContent() {
		viewer.setText("");
		//Color color = new Color(null,0,0,0);
		//viewer.setTextColor(color);
	}
	
	public Vector<Integer> getRange(int number, Vector<Integer> entails) {
		int count=0;
		int start=0;
		int end=0;
		int startLine = 0;
		int endLine = 0;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
		        .getActiveEditor();
		    if (!(editor instanceof ITextEditor)) return null;
		    ITextEditor ite = (ITextEditor)editor;
		    document = ite.getDocumentProvider().getDocument(ite.getEditorInput());
		   // ITextSelection selection = (ITextSelection) editor.getEditorSite().getSelectionProvider().getSelection();

		    
		String[] lines = document.get().split(System.getProperty("line.separator"));
		//System.out.println("I reached before"+ entails.size());
		//if (selection.getLength()!=0) {
			
			for (int i=0;i<lines.length;i++) {
				//end += lines[i].length()+1;
				//System.out.println("I reached middle");
				if (lines[i].contains("checkentail")/*&(i>=entails.get(0)&i<=entails.get(1))*/) {
					
					startLine = i;
					while (!lines[i].endsWith(".")) {
						end += lines[i].length()+1;
						i++;
					}
					end += lines[i].length()+1;
					endLine = i;
					if (startLine<=entails.get(0)&&endLine>=entails.get(1))
						break;
					else if (startLine>=entails.get(0)&&endLine<=entails.get(1)) {
						count++;
						if (count==number)
							break;
					}
					start = end;
				}
				else {
					start += lines[i].length()+1;
					end = start;
				}
			}
		//}
	
		Vector<Integer> result = new Vector<Integer>();
		result.add(start);
		result.add(end);
		//System.out.println("start: "+start+" end: "+end);
		return result;
	}
	
	public void setStyle(Color color, int number, int offset, int length, Vector<Integer> entails) {
		Vector<Integer> range = getRange(number, entails);
		listeners.add(range.get(0));
		listeners.add(range.get(1));
		offsets.add(offset);
		offsets.add(length);
		
		StyleRange style = new StyleRange();
		style.underline = true;
		style.underlineStyle = SWT.UNDERLINE_LINK;
		style.fontStyle = SWT.BOLD;
		style.foreground = color;
		style.start = offset;
		style.length = length;
		viewer.setStyleRange(style);
		
	}
	
	public Vector<Integer> getListenerRange() {
		return listeners;
	}
	
	public void clearListener() {
		listeners.clear();
	}
	
	public void addListener() {
		final Vector<Integer> temp = listeners;
		//System.out.println("offsets: "+offsets.get(0)+" "+ offsets.get(1));
		viewer.addListener(SWT.MouseDown, new Listener(){
			public void handleEvent(Event event) {
				
					try {
							IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
						        .getActiveEditor();
						    if (!(editor instanceof ITextEditor)) return;
						    ITextEditor ite = (ITextEditor)editor;
						    
						    int offset = viewer.getOffsetAtLocation(new Point(event.x, event.y));
						    //System.out.println("I clicked here: "+offset);
						    StyleRange style = viewer.getStyleRangeAtOffset(offset);
						    
						    if (style !=null && style.underline && style.underlineStyle== SWT.UNDERLINE_LINK) {
						    	for (int i=0;i<offsets.size()/2;i++) {
						    		if (offset>=offsets.get(2*i)&&offset<=offsets.get(2*i)+offsets.get(2*i+1))
						    			ite.selectAndReveal(temp.get(2*i), temp.get(2*i+1)-temp.get(2*i));
						    	}
						    }
					} catch(Exception e) {
						
					}
				
			}
		});
	}
	
}