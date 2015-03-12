package hip.actions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Vector;

import hip.views.HIPView;

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
import org.eclipse.ui.texteditor.ITextEditor;

public class HIPAction implements IWorkbenchWindowActionDelegate {
	private HIPView editorView;
    private IWorkbenchWindow window;
    private IViewReference[] viewer;

    
    public static final String ID = "hip.actions.HIPAction";
    
    /**
	 * The constructor.
	 */
	public HIPAction() {
	}
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		try {
    		editorView = new HIPView();
    		editorView.initialize();
    		Vector<Integer> entailRange = editorView.getEntailRange();
    		IDocument doc = editorView.getDocument();
    		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
        	        .getActiveEditor();
        	    if (!(editor instanceof ITextEditor)) return;
        	    ITextEditor ite = (ITextEditor)editor;
            IEditorInput input = ite.getEditorInput();
            
           /* IResource resource = (IResource) input.getAdapter(IResource.class);
    		
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
        	
    		
            IViewPart hipView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("hip.views.HIPView");

            
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
            	
            	String[] lines = total.split(System.getProperty("line.separator"));
            	int i=0;
            	int number=0;
            	while(i<lines.length) {
	            	String tempLine[] = lines[i].split("\\s+");
					if (tempLine[0].equals("Procedure")) {
						number++;
						if (tempLine[tempLine.length-1].contains("SUCCESS")) {
							Color color = new Color(null,0,255,0);
							((HIPView) hipView).setStyle(color, number, position, lines[i].length(), entailRange);
							 
							/*Vector<Integer> range = ((HIPView) hipView).getListenerRange();
							IMarker marker = resource.createMarker(IMarker.BOOKMARK);
				        	
				        	marker.setAttribute(IMarker.CHAR_START, range.get(range.size()-1));
				        	marker.setAttribute(IMarker.CHAR_END, range.get(range.size()-2));
				        	marker.setAttribute(IMarker.MESSAGE, lines[i]);
				        	marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
				        	marker.setAttribute(IMarker.LINE_NUMBER, i+1);
				        	marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);*/
						}
						else if (tempLine[tempLine.length-1].contains("FAIL")) {
							Color color = new Color(null,255,0,0);
							((HIPView) hipView).setStyle(color, number, position, lines[i].length(), entailRange);
						//	MessageDialog.openInformation(null, "start"+start.size(), "number: "+number);
							/*Vector<Integer> range = ((HIPView) hipView).getListenerRange();
							IMarker marker = resource.createMarker(IMarker.PROBLEM);
				        	
							marker.setAttribute(IMarker.CHAR_START, range.get(range.size()-1));
				        	marker.setAttribute(IMarker.CHAR_END, range.get(range.size()-2));
				        	marker.setAttribute(IMarker.MESSAGE, lines[i]);
				        	marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
				        	marker.setAttribute(IMarker.LINE_NUMBER, i+1);
				        	marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);*/
						}
					}
					position += lines[i].length()+1;
					i++;
            	}
            }
            
          //  ((HIPView) hipView).addListener();
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            System.out.println("Verification finished");
            p.destroy();
            
            temp.delete();
            /*if (!(sleekView instanceof ITextViewer))  MessageDialog.openInformation(
        			window.getShell(),
        			"SLEEK",
        			"YES");
            */
           
            
    	   // ITextEditor SV = (ITextEditor)sleekView;
            

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
