package hip.actions;

import hip.views.HIPView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.jface.dialogs.MessageDialog;

public class HIPSelection implements IWorkbenchWindowActionDelegate {
	private HIPView editorView;
    private IWorkbenchWindow window;
    private IViewReference[] viewer;
    public static final String ID = "hip.actions.HIPSelection";
	
    public HIPSelection() {
	}
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		try {
			editorView = new HIPView();
    		editorView.initializeSelection();
    		//Vector<Integer> entailRange = editorView.getEntailRange();
    		IDocument doc = editorView.getDocument();
    		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
        	        .getActiveEditor();
        	    if (!(editor instanceof ITextEditor)) return;
        	    ITextEditor ite = (ITextEditor)editor;
            IEditorInput input = ite.getEditorInput();
            
          /*  IResource resource = (IResource) input.getAdapter(IResource.class);
    		
            IFile ifile = ((FileEditorInput) input).getFile();
        	IMarker markes[];
        	markes = ifile.findMarkers(IMarker.BOOKMARK, false, 0);
        	for (int i = 0; i < markes.length; i++)
            	markes[i].delete();
        	markes = ifile.findMarkers(IMarker.BOOKMARK, true, 0);
        	for (int i = 0; i < markes.length; i++)
            	markes[i].delete();
        	markes = ifile.findMarkers(IMarker.PROBLEM, false, 0);
        	for (int i = 0; i < markes.length; i++)
            	markes[i].delete();
        	markes = ifile.findMarkers(IMarker.PROBLEM, true, 0);
        	for (int i = 0; i < markes.length; i++)
            	markes[i].delete();*/
        	
    		IViewPart hipView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("sleek.views.SLEEKView");
            
            File temp = new File(".temp.slk");
            FileWriter fw = new FileWriter(temp.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(doc.get());
            bw.close();
            
            String cmdArray = null;
            cmdArray = "/home/yongxin/sleek_hip/./hip .temp.slk";
            //File dir = new File("/home/yongxin/workspace");
            //rse://LORIS-82.DDNS.COMP.NUS.EDU.SG/home/yongxin/eclipse/workplace/SLEEK
            Process p;
            String s,total;
			int position = 0;
            total = "";
            p = Runtime.getRuntime().exec(cmdArray);
            
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            if (hipView != null) {
            	((HIPView) hipView).clearContent();
            	//((SLEEKView) sleekView).clearListener();
            	while ((s = br.readLine()) != null) {
            		total += s;
            		total += "\n";
                //System.out.println("line: " + s);
            	}
            	IDocument totalDoc = new Document();
            	totalDoc.set(total);
            	((HIPView) hipView).setDocument(totalDoc);
            	
            	/*String[] lines = total.split(System.getProperty("line.separator"));
            	int i=0;
            	int number=0;
            	while(i<lines.length) {
	            	String tempLine[] = lines[i].split("\\s+");
					if (tempLine[0].equals("Entail")) {
						number++;
						if (tempLine[2].contains("Valid")) {
							Color color = new Color(null,0,255,0);
							//((SLEEKView) sleekView).setTextColor(color,position,lines[i].length(),true);
							 ((SLEEKView) sleekView).setStyle(color, number, position, lines[i].length(), entailRange);
							 
							 Vector<Integer> range = ((SLEEKView) sleekView).getListenerRange();
								IMarker marker = resource.createMarker(IMarker.BOOKMARK);
					        	
								marker.setAttribute(IMarker.CHAR_START, range.get(range.size()-1));
					        	marker.setAttribute(IMarker.CHAR_END, range.get(range.size()-2));
					        	marker.setAttribute(IMarker.MESSAGE, lines[i]);
					        	marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
					        	marker.setAttribute(IMarker.LINE_NUMBER, i+1);
					        	marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
						}
						else if (tempLine[2].contains("Fail")) {
							Color color = new Color(null,255,0,0);
							//((SLEEKView) sleekView).setTextColor(color,position,lines[i].length(),true);
							((SLEEKView) sleekView).setStyle(color, number, position, lines[i].length(), entailRange);
							
							Vector<Integer> range = ((SLEEKView) sleekView).getListenerRange();
							//MessageDialog.openInformation(null, "range: "+range.size(), "fisrt: "+range.get(0)+"second: "+range.get(1));
							IMarker marker = resource.createMarker(IMarker.PROBLEM);
				        	
							marker.setAttribute(IMarker.CHAR_START, range.get(range.size()-1));
				        	marker.setAttribute(IMarker.CHAR_END, range.get(range.size()-2));
				        	marker.setAttribute(IMarker.MESSAGE, lines[i]);
				        	marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
				        	marker.setAttribute(IMarker.LINE_NUMBER, i+1);
				        	marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						}
						
					}
					position += lines[i].length()+1;
					i++;
            	}*/
            }
         //   ((HIPView) hipView).addListener();
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            System.out.println("Verification finished");
            p.destroy();
            
            temp.delete();
    		
		} catch (Exception e) {
			
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		this.window = window;
	}

}
