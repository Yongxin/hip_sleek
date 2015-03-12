package hip.views;


import java.util.Vector;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.*;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
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

public class HIPView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "hip.views.HIPView";

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
	public HIPView() {
		viewer = null;
		text = null;
		label = null;
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
		String save = "";
		/*String temp[] = document.get().split("\\s+");
		
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
		}*/
		
		ITextSelection selection = (ITextSelection) editor.getEditorSite().getSelectionProvider().getSelection();
		
		//if (selection.getLength()!=0) {
			save += selection.getText();
		
			entail.add(selection.getStartLine());
			entail.add(selection.getEndLine());
			//System.out.println("Initialized entail: "+entail.size());
		//}
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
	/*	viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "HIP.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();*/
		viewer = new StyledText(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL );
		
	}

/*	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				HIPView.this.fillContextMenu(manager);
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
			"HIP View",
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
	
	public void setStyle(Color color, int number, int offset, int length, Vector<Integer> entails) {
		//Vector<Integer> range = getRange(number, entails);
		//listeners.add(range.get(0));
		//listeners.add(range.get(1));
		//offsets.add(offset);
		//offsets.add(length);
		
		StyleRange style = new StyleRange();
		style.underline = true;
		style.underlineStyle = SWT.UNDERLINE_LINK;
		style.fontStyle = SWT.BOLD;
		style.foreground = color;
		style.start = offset;
		style.length = length;
		viewer.setStyleRange(style);
		
	}
	
	public void clearContent() {
		viewer.setText("");
		//Color color = new Color(null,0,0,0);
		//viewer.setTextColor(color);
	}
	
	public Vector<Integer> getListenerRange() {
		return listeners;
	}
	
	public void clearListener() {
		listeners.clear();
	}
}