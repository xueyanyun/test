

import java.awt.dnd.DragGestureEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.jar.Attributes.Name;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.event.AncestorEvent;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.lf5.viewer.TrackingAdjustmentListener;


class Base {
	  String name = "test1";
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	
}

class Derive extends Base {
	private String name = "test2";
	@Override
	void setName(String name) {
		super.name = name;
	}
	@Override
	String getName() {
		//return name;
		return super.getName();
	}
	

}

enum Color {

	RED,GREEN,BULE;
	

}

public class Test {	


		  public static void main(String[] args) throws Throwable {
//			  ArrayList<String> arrayList = new ArrayList<String>();
//			  arrayList.add("a");
//			  arrayList.add("b");
//			  arrayList.toArray();
//			  
//			  
//			  arrayList.toArray();
//			  arrayList.toArray(a)
//			  
//			  String[] array = arrayList.toArray(new String[0]);
//			  
//			 Runtime.getRuntime().addShutdownHook(new Thread(){
//				 @Override
//				public void run() {
//					// TODO Auto-generated method stub
//					super.run();
//				}
//			 });
//			 
//			 String workDir;
//			 File file;
			 
//			 ArrayList<URL> classPath = new ArrayList<URL>();
//			    classPath.add(new File(workDir+"/").toURL());
//			    classPath.add(file.toURL());
//			    classPath.add(new File(workDir, "classes/").toURL());
//			    File[] libs = new File(workDir, "lib").listFiles();
//			    if (libs != null) {
//			      for (int i = 0; i < libs.length; i++) {
//			        classPath.add(libs[i].toURL());
//			      }
//			    }
			 
			 
//			 ClassLoader loader =
//		      new URLClassLoader(classPath.toArray(new URL[0]));
//
//		    Thread.currentThread().setContextClassLoader(loader);
//		    Class<?> mainClass = Class.forName(mainClassName, true, loader);
//		    Method main = mainClass.getMethod("main", new Class[] {
//		      Array.newInstance(String.class, 0).getClass()
//		    });
//		    String[] newArgs = Arrays.asList(args)
//		      .subList(firstArg, args.length).toArray(new String[0]);
//		    try {
//		      main.invoke(null, new Object[] { newArgs });
//		    } catch (InvocationTargetException e) {
//		      throw e.getTargetException();
//		    }
			 
			 
//			 ArrayList<URL>  classPath = new ArrayList<URL>();
//			 classPath.add(new File(workDir + "/").toURL());
//			 classPath.add(file.toURL());
//			 classPath.add(new File(workDir, "classes/").toURL());
//			 File[] libs = new File(workDir, "lib").listFiles();
//			    if (libs != null) {
//		      for (int i = 0; i < libs.length; i++) {
//		        classPath.add(libs[i].toURL());
//		      }
//		    }
//			    
//			ClassLoader loader = new URLClassLoader(classPath.toArray(new URL[0]));
//			
//			Thread.currentThread().setContextClassLoader(loader);
//			String mainClassName;
//			Class<?> mainClass = Class.forName(mainClassName, true ,loader);
//			
//			
//			
//			Method method = mainClass.getMethod("main", new Class[] {Array.newInstance(String.class, 0).getClass()});
//
//			method.invoke(obj, args)
			  
			  
			
		
					
			
			 


			 test(1);
			 test(12,13);
			 test(new int[]{1,2});
			 
			 
			 
			  

		 

	  
	  }	
		 
		  public static void test(int... a){
			  for(int i=0;i<a.length;i++){
			  System.out.println(a[i]);
			  }
			  }
		  
		  
}


	

  
 

