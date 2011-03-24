package ru.fssp38.fsspSite;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * Стартовая страница
 *
 */
public class App extends SingleFrameApplication {

        @Override protected void startup() {
            show(new FsspSiteView(this));
        }

        /**
         * This method is to initialize the specified window by injecting resources.
         * Windows shown in our application come fully initialized from the GUI
         * builder, so this additional configuration is not needed.
         */
        @Override protected void configureWindow(java.awt.Window root) {
        }

        /**
         * A convenient static getter for the application instance.
         * @return the instance of App
         */
        public static App getApplication() {
            return Application.getInstance(App.class);
        }

        /**
         * Main method launching the application.
         */
        public static void main(String[] args) {
            launch(App.class, args);
        }
    }
