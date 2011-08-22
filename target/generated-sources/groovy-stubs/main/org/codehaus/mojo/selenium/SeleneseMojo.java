//
// Generated stub from file:/C:/Users/mkiami/Documents/Selenium/Snapshot/selenium-maven-plugin/src/main/groovy/org/codehaus/mojo/selenium/SeleneseMojo.groovy
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
import org.apache.maven.project.MavenProject;
import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.htmlrunner.HTMLLauncher;

/**
 * Run a suite of HTML Selenese tests.
 *
 * @goal selenese
 * @since 1.0-beta-2
 * @version $Id: SeleneseMojo.groovy 12859 2010-10-13 09:36:15Z olamy $
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class SeleneseMojo
    extends GroovyMojo
    implements groovy.lang.GroovyObject
{
    /**
     * The suite file to run.
     *
     * @parameter
     * @required
     */
    private File suite = null;
    public File getSuite() {
        throw new InternalError("Stubbed method");
    }
    public void setSuite(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The browser name to run; must be one of the standard valid browser names
     * (and must start with a *), e.g. *firefox, *iexplore, *custom.
     *
     * @parameter
     * @required
     */
    private java.lang.String browser = null;
    public java.lang.String getBrowser() {
        throw new InternalError("Stubbed method");
    }
    public void setBrowser(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The base URL on which the tests will be run, e.g. http://www.google.com.
     * Note that only the hostname part of this URL will really be used.
     *
     * @parameter
     * @required
     */
    private URL startURL = null;
    public URL getStartURL() {
        throw new InternalError("Stubbed method");
    }
    public void setStartURL(URL value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The file to which we'll write out our test results.
     *
     * @parameter
     */
    private File results = null;
    public File getResults() {
        throw new InternalError("Stubbed method");
    }
    public void setResults(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The port on which we'll run the Selenium Server.
     *
     * @parameter default-value="4444"
     */
    private int port = 0;
    public int getPort() {
        throw new InternalError("Stubbed method");
    }
    public void setPort(int value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Amount of time to wait before we just kill the browser.
     *
     * @parameter default-value="1800"
     */
    private int timeoutInSeconds = 0;
    public int getTimeoutInSeconds() {
        throw new InternalError("Stubbed method");
    }
    public void setTimeoutInSeconds(int value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * True if the application under test should run in its own window, false if
     * the AUT will run in an embedded iframe.
     *
     * @parameter default-value="false"
     */
    private boolean multiWindow = false;
    public boolean getMultiWindow() {
        throw new InternalError("Stubbed method");
    }
    public boolean isMultiWindow() {
        throw new InternalError("Stubbed method");
    }
    public void setMultiWindow(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * A debugging tool that slows down the Selenium Server. (Selenium developers only)
     *
     * @parameter default-value="false"
     */
    private boolean slowResources = false;
    public boolean getSlowResources() {
        throw new InternalError("Stubbed method");
    }
    public boolean isSlowResources() {
        throw new InternalError("Stubbed method");
    }
    public void setSlowResources(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Allows the tests to be skipped.
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
     * @parameter expression="${project}"
     * @required
     * @readonly
     */
    private MavenProject project = null;
    public MavenProject getProject() {
        throw new InternalError("Stubbed method");
    }
    public void setProject(MavenProject value) {
        throw new InternalError("Stubbed method");
    }

    public void execute() {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String extractUsableBrowserName() {
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
