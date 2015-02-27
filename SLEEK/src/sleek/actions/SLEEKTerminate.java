package sleek.actions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;

import sleek.views.SLEEKView;

public class SLEEKTerminate implements IViewActionDelegate{
	private IViewPart view;
	private static final String TASKLIST = "ps -u";
	private static final String KILL = "pkill";
	
	public void init(IViewPart view){
		this.view = view;
	}
	
	public void run(IAction action){
		String processName = "sleek";
		IViewPart sleekView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("sleek.views.SLEEKView");
		IDocument termination = new Document();
		
		 if (isProcessRunning(processName)){
			 killProcess(processName);
			 termination.set("Sleek terminated.");;
			 ((SLEEKView) sleekView).setDocument(null);
			 ((SLEEKView) sleekView).setDocument(termination);
		 }
		 else {
			 termination.set("No sleek program is running.");
			 ((SLEEKView) sleekView).setDocument(null);
			 ((SLEEKView) sleekView).setDocument(termination);
		 }
	}
	
	public static boolean isProcessRunning(String serviceName){
		try {
			Process p = Runtime.getRuntime().exec(TASKLIST);
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = reader.readLine())!=null) {
				if (line.contains(serviceName)) {
					return true;
				}
			}
			
			return false;
		} catch (Exception e){
			return false;
		}
	}
	
	public static void killProcess(String serviceName){
		try {
			Runtime.getRuntime().exec(KILL + serviceName);
		} catch(Exception e){
			
		}
	}
	public void selectionChanged(IAction action, ISelection selection){
		
	}
}
