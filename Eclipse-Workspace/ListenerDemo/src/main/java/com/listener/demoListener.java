package com.listener;

import java.text.SimpleDateFormat;

import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class demoListener implements HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

    public void sessionCreated(HttpSessionEvent se)  { 
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	System.out.println("Listener - Sessioncreated(): Hello.");
    	System.out.println("Session created at"+sdf.format(se.getSession().getCreationTime()));
    }

    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Servlet - RequestDestroyed(): Hello.");
    }

    public void requestInitialized(ServletRequestEvent sre)  {
    	System.out.println("Servlet Invoked!!!");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	System.out.println("Listener - SessionDestroyed(): Hello.");
    	System.out.println("Session created at"+sdf.format(se.getSession().getCreationTime()));
    }

    public void attributeAdded(HttpSessionBindingEvent se)  { 
         System.out.println("Listener: Key with "+se.getName()
         +" and Value with "+se.getValue()+" added Successfully.");
    }

    public void attributeRemoved(HttpSessionBindingEvent se)  { 
        System.out.println("Listener: Key with "+se.getName()
        +" and Value with "+se.getValue()+" removed Successfully.");
    }

    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println("Listener: Key with "+se.getName()
        +" is updated with "+se.getValue()+" value Successfully.");
    }
	
}
