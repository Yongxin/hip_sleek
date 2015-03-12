package hip.actions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import hip.views.*;

public class HIPTerminate implements IViewActionDelegate {
	private IViewPart view;
	private static final String TASKLIST = "ps -u";
	private static final String KILL = "pkill";
	
	
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		String processName = "hip";
		IViewPart hipView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("hip.views.HIPView");
		IDocument termination = new Document();
		
		 if (isProcessRunning(processName)){
			 killProcess(processName);
			 termination.set("Sleek terminated.");;
			 ((HIPView) hipView).setDocument(null);
			 ((HIPView) hipView).setDocument(termination);
		 }
		 else {
			 termination.set("No sleek program is running.");
			 ((HIPView) hipView).setDocument(null);
			 ((HIPView) hipView).setDocument(termination);
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

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IViewPart view) {
		// TODO Auto-generated method stub
		this.view = view;
	}

}
