//
// Generated stub from file:/C:/Users/mkiami/Documents/Selenium/Snapshot/selenium-maven-plugin/src/main/groovy/org/codehaus/mojo/selenium/XvfbMojo.groovy
//

package org.codehaus.mojo.selenium;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.gmaven.mojo.GroovyMojo;
import org.codehaus.gmaven.mojo.support.ProcessLauncher;

/**
 * Starts an Xvfb instance suitable for handling X11 displays for headless systems.
 * Use this in combonation with the <tt>start-server</tt> goal to allow browsers
 * to be launched on headless unix systems.
 * 
 * <p>
 * Optionally uses 'xauth' to setup authentication for the Xvfb instance to allow running tests using the
 * frame buffer server when another X server is already running.
 * </p>
 *
 * @goal xvfb
 * @since 1.0-beta-2
 * @version $Id: XvfbMojo.groovy 12871 2010-10-13 20:18:25Z olamy $
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class XvfbMojo
    extends GroovyMojo
    implements groovy.lang.GroovyObject
{
    /**
     * The 'Xvfb' command to execute.
     *
     * @parameter default-value="Xvfb"
     * @required
     */
    private java.lang.String xvfbExecutable = null;
    public java.lang.String getXvfbExecutable() {
        throw new InternalError("Stubbed method");
    }
    public void setXvfbExecutable(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Use 'xauth' to setup permissions for the Xvfb server.  This requires 'xauth' be installed
     * and may be required when an X server is already running.
     *
     * @parameter default-value="true"
     */
    private boolean xauthEnabled = false;
    public boolean getXauthEnabled() {
        throw new InternalError("Stubbed method");
    }
    public boolean isXauthEnabled() {
        throw new InternalError("Stubbed method");
    }
    public void setXauthEnabled(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The 'xauth' command to execute.
     *
     * @parameter default-value="xauth"
     */
    private java.lang.String xauthExecutable = null;
    public java.lang.String getXauthExecutable() {
        throw new InternalError("Stubbed method");
    }
    public void setXauthExecutable(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The 'xauth' protocol.
     *
     * @parameter default-value="."
     */
    private java.lang.String xauthProtocol = null;
    public java.lang.String getXauthProtocol() {
        throw new InternalError("Stubbed method");
    }
    public void setXauthProtocol(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The file where X authentication data is stored for the Xvfb session.
     * Default is to generate a temporary file.
     *
     * @parameter
     */
    private File authenticationFile = null;
    public File getAuthenticationFile() {
        throw new InternalError("Stubbed method");
    }
    public void setAuthenticationFile(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The default display to use.  SSH usualy eats up :10, so lets use :20.  That starts at port 6020.
     */
    static final private int DEFAULT_DISPLAY_NUMBER = 0;
    static final public int getDEFAULT_DISPLAY_NUMBER() {
        throw new InternalError("Stubbed method");
    }

    /**
     * The X11 display to use.  Default value is <tt>:20</tt>.
     *
     * @parameter
     */
    private java.lang.String display = null;
    public java.lang.String getDisplay() {
        throw new InternalError("Stubbed method");
    }
    public void setDisplay(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * A list of additional options to pass to the Xvfb process.
     *
     * @parameter
     */
    private java.lang.String[] options = null;
    public java.lang.String[] getOptions() {
        throw new InternalError("Stubbed method");
    }
    public void setOptions(java.lang.String[] value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The location of the file to write the display properties which will be picked up
     * by the <tt>start-server</tt> goal.
     *
     * @parameter default-value="${project.build.directory}/selenium/display.properties"
     * @required
     */
    private File displayPropertiesFile = null;
    public File getDisplayPropertiesFile() {
        throw new InternalError("Stubbed method");
    }
    public void setDisplayPropertiesFile(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Enable logging mode.
     *
     * @parameter default-value="true"
     */
    private boolean logOutput = false;
    public boolean getLogOutput() {
        throw new InternalError("Stubbed method");
    }
    public boolean isLogOutput() {
        throw new InternalError("Stubbed method");
    }
    public void setLogOutput(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The file that Xvfb output will be written to.
     *
     * @parameter default-value="${project.build.directory}/selenium/xvfb.log"
     */
    private File logFile = null;
    public File getLogFile() {
        throw new InternalError("Stubbed method");
    }
    public void setLogFile(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Flag to control if we background the process or block Maven execution.
     *
     * @parameter default-value="true"
     */
    private boolean background = false;
    public boolean getBackground() {
        throw new InternalError("Stubbed method");
    }
    public boolean isBackground() {
        throw new InternalError("Stubbed method");
    }
    public void setBackground(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Skip goal execution
     *
     * @parameter expression="${maven.test.skip}" default-value="false"
     */
    private boolean skip = false;
    public boolean getSkip() {
        throw new InternalError("Stubbed method");
    }
    public boolean isSkip() {
        throw new InternalError("Stubbed method");
    }
    public void setSkip(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Reuse Xvfb process
     *
     * @parameter expression="${xvfb.reuse}" default-value="false"
     * @since 1.1
     */
    private boolean reuse = false;
    public boolean getReuse() {
        throw new InternalError("Stubbed method");
    }
    public boolean isReuse() {
        throw new InternalError("Stubbed method");
    }
    public void setReuse(boolean value) {
        throw new InternalError("Stubbed method");
    }

    static final private java.lang.String DISPLAY_FILE_PROP = null;
    static final public java.lang.String getDISPLAY_FILE_PROP() {
        throw new InternalError("Stubbed method");
    }

    public void execute() {
        throw new InternalError("Stubbed method");
    }

    private void createDisplayProperties() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Generate a 128-bit random hexadecimal number for use with the X authority system.
     */
    private java.lang.String createCookie() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Setup the X authentication file (Xauthority)
     */
    private void setupXauthority() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Detect which display is usable.
     */
    private java.lang.String detectUsableDisplay() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Decode the port number for the display.
     */
    private int decodeDisplayPort(java.lang.Object display) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Check if the given display is in use or not.
     */
    private boolean isDisplayInUse(java.lang.Object display) {
        throw new InternalError("Stubbed method");
    }

    public groovy.lang.MetaClass getMetaClass() {
        throw new InternalError("Stubbed method");
    }

    public void setMetaClass(groovy.lang.MetaClass metaClass) {
        throw new InternalError("Stubbed method");
    }

    public java.lang.Object invokeMethod(java.lang.String name, java.lang.Object args) {
        throw new InternalError("Stubbed method");
    }

    public java.lang.Object getProperty(java.lang.String name) {
        throw new InternalError("Stubbed method");
    }

    public void setProperty(java.lang.String name, java.lang.Object value) {
        throw new InternalError("Stubbed method");
    }
}
