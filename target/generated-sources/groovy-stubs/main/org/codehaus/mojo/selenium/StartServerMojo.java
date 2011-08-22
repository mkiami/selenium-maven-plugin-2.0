//
// Generated stub from file:/C:/Users/mkiami/Documents/Selenium/Snapshot/selenium-maven-plugin/src/main/groovy/org/codehaus/mojo/selenium/StartServerMojo.groovy
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
import org.apache.commons.lang.SystemUtils;
import com.thoughtworks.selenium.DefaultSelenium;
import org.codehaus.gmaven.mojo.support.ProcessLauncher;

/**
 * Start the Selenium server.
 *
 * @goal start-server
 * @since 1.0-beta-1
 * @version $Id: StartServerMojo.groovy 14177 2011-06-17 08:07:38Z olamy $
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class StartServerMojo
    extends GroovyMojo
    implements groovy.lang.GroovyObject
{
    /**
     * The port number of the server to connect to.
     *
     * @parameter expression="${port}" default-value="4444"
     */
    private int port = 0;
    public int getPort() {
        throw new InternalError("Stubbed method");
    }
    public void setPort(int value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Timeout for the server in seconds.
     *
     * @parameter expression="${timeout}" default-value="-1"
     */
    private int timeout = 0;
    public int getTimeout() {
        throw new InternalError("Stubbed method");
    }
    public void setTimeout(int value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Enable the server's debug mode..
     *
     * @parameter expression="${debug}" default-value="false"
     */
    private boolean debug = false;
    public boolean getDebug() {
        throw new InternalError("Stubbed method");
    }
    public boolean isDebug() {
        throw new InternalError("Stubbed method");
    }
    public void setDebug(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Working directory where Selenium server will be started from.
     *
     * @parameter expression="${project.build.directory}/selenium"
     * @required
     */
    private File workingDirectory = null;
    public File getWorkingDirectory() {
        throw new InternalError("Stubbed method");
    }
    public void setWorkingDirectory(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Enable logging mode.
     *
     * @parameter expression="${logOutput}" default-value="false"
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
     * The file that Selenium server logs will be written to.
     *
     * @parameter expression="${logFile}" default-value="${project.build.directory}/selenium/server.log"
     * @required
     */
    private File logFile = null;
    public File getLogFile() {
        throw new InternalError("Stubbed method");
    }
    public void setLogFile(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Flag to control if we background the server or block Maven execution.
     *
     * @parameter expression="${background}" default-value="false"
     * @required
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
     * Attempt to verify the named browser configuration.  Must be one of the
     * standard valid browser names (and must start with a *), e.g. *firefox, *iexplore, *custom.
     *
     * @parameter expression="${verifyBrowser}"
     */
    private java.lang.String verifyBrowser = null;
    public java.lang.String getVerifyBrowser() {
        throw new InternalError("Stubbed method");
    }
    public void setVerifyBrowser(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Puts you into a mode where the test web site executes in a frame. This mode should only be
     * selected if the application under test does not use frames.
     *
     * @parameter expression="${singleWindow}" default-value="false"
     * @since 1.0-rc-1
     */
    private boolean singleWindow = false;
    public boolean getSingleWindow() {
        throw new InternalError("Stubbed method");
    }
    public boolean isSingleWindow() {
        throw new InternalError("Stubbed method");
    }
    public void setSingleWindow(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Sets the browser mode (e.g. "*iexplore" for all sessions).
     *
     * @parameter expression="${forcedBrowserMode}"
     * @since 1.0-beta-3
     */
    private java.lang.String forcedBrowserMode = null;
    public java.lang.String getForcedBrowserMode() {
        throw new InternalError("Stubbed method");
    }
    public void setForcedBrowserMode(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Stops re-initialization and spawning of the browser between tests.
     *
     * @parameter expression="${browserSessionReuse}" default-value="false"
     * @since 1.0-beta-3
     */
    private boolean browserSessionReuse = false;
    public boolean getBrowserSessionReuse() {
        throw new InternalError("Stubbed method");
    }
    public boolean isBrowserSessionReuse() {
        throw new InternalError("Stubbed method");
    }
    public void setBrowserSessionReuse(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The file or resource to use for default user-extensions.js.
     *
     * @parameter default-value="org/codehaus/mojo/selenium/default-user-extensions.js"
     */
    private java.lang.String defaultUserExtensions = null;
    public java.lang.String getDefaultUserExtensions() {
        throw new InternalError("Stubbed method");
    }
    public void setDefaultUserExtensions(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Enable or disable default user-extensions.js
     *
     * @parameter default-value="true"
     */
    private boolean defaultUserExtensionsEnabled = false;
    public boolean getDefaultUserExtensionsEnabled() {
        throw new InternalError("Stubbed method");
    }
    public boolean isDefaultUserExtensionsEnabled() {
        throw new InternalError("Stubbed method");
    }
    public void setDefaultUserExtensionsEnabled(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Location of the user-extensions.js to load into the server.
     * If defaultUserExtensionsEnabled is true, then this file will be appended to the defaults.
     *
     * @parameter expression="${userExtensions}"
     */
    private java.lang.String userExtensions = null;
    public java.lang.String getUserExtensions() {
        throw new InternalError("Stubbed method");
    }
    public void setUserExtensions(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * By default, we proxy every browser request; set this
     * flag to make the browser use our proxy only for URLs containing
     * '/selenium-server'
     *
     * @parameter expression="${avoidProxy}" default-value="false"
     * @since 1.0-beta-3
     */
    private boolean avoidProxy = false;
    public boolean getAvoidProxy() {
        throw new InternalError("Stubbed method");
    }
    public boolean isAvoidProxy() {
        throw new InternalError("Stubbed method");
    }
    public void setAvoidProxy(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Normally a fresh empty Firefox profile is created every time we launch.
     * You can specify a directory to make us copy your profile directory instead.
     *
     * @parameter expression="${firefoxProfileTemplate}"
     */
    private File firefoxProfileTemplate = null;
    public File getFirefoxProfileTemplate() {
        throw new InternalError("Stubbed method");
    }
    public void setFirefoxProfileTemplate(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Enables logging on the browser side; logging
     * messages will be transmitted to the server.  This can affect
     * performance.
     *
     * @parameter expression="${browserSideLog}" defalut-value="false"
     * @since 1.0-beta-3
     */
    private boolean browserSideLog = false;
    public boolean getBrowserSideLog() {
        throw new InternalError("Stubbed method");
    }
    public boolean isBrowserSideLog() {
        throw new InternalError("Stubbed method");
    }
    public void setBrowserSideLog(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * If the browser does not have user profiles,
     * make sure every new session has no artifacts from previous
     * sessions.  For example, enabling this option will cause all user
     * cookies to be archived before launching IE, and restored after IE
     * is closed.
     *
     * @parameter expression="${ensureCleanSession}" default-value="false"
     * @since 1.0-beta-3
     */
    private boolean ensureCleanSession = false;
    public boolean getEnsureCleanSession() {
        throw new InternalError("Stubbed method");
    }
    public boolean isEnsureCleanSession() {
        throw new InternalError("Stubbed method");
    }
    public void setEnsureCleanSession(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Forces the Selenium proxy to trust all
     * SSL certificates.  This doesn't work in browsers that don't use the
     * Selenium proxy.
     *
     * @parameter expression="${trustAllSSLCertificates}" default-value="false"
     * @since 1.0-beta-3
     */
    private boolean trustAllSSLCertificates = false;
    public boolean getTrustAllSSLCertificates() {
        throw new InternalError("Stubbed method");
    }
    public boolean isTrustAllSSLCertificates() {
        throw new InternalError("Stubbed method");
    }
    public void setTrustAllSSLCertificates(boolean value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The location of the file to read the display properties.
     *
     * @parameter default-value="${project.build.directory}/selenium/display.properties"
     */
    private File displayPropertiesFile = null;
    public File getDisplayPropertiesFile() {
        throw new InternalError("Stubbed method");
    }
    public void setDisplayPropertiesFile(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The location of the SSL trust-store.
     *
     * @parameter expression="${trustStore}"
     * @since 1.0-beta-3
     */
    private File trustStore = null;
    public File getTrustStore() {
        throw new InternalError("Stubbed method");
    }
    public void setTrustStore(File value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * The password for the SSL trust-store.
     *
     * @parameter expression="${trustStorePassword}"
     * @since 1.0-beta-3
     */
    private java.lang.String trustStorePassword = null;
    public java.lang.String getTrustStorePassword() {
        throw new InternalError("Stubbed method");
    }
    public void setTrustStorePassword(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Configure the Selenium Server to use <tt>http.proxyPort</tt>.
     *
     * @parameter expression="${proxyPort}"
     * @since 1.0-rc-2
     */
    private java.lang.String proxyPort = null;
    public java.lang.String getProxyPort() {
        throw new InternalError("Stubbed method");
    }
    public void setProxyPort(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Configure the Selenium Server to use <tt>http.proxyHost</tt>.
     *
     * @parameter expression="${proxyHost}"
     * @since 1.0-rc-2
     */
    private java.lang.String proxyHost = null;
    public java.lang.String getProxyHost() {
        throw new InternalError("Stubbed method");
    }
    public void setProxyHost(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Configure the Selenium Server to use <tt>http.nonProxyHosts</tt>.
     *
     * @parameter expression="${nonProxyHosts}"
     * @since 1.0-rc-2
     */
    private java.lang.String nonProxyHosts = null;
    public java.lang.String getNonProxyHosts() {
        throw new InternalError("Stubbed method");
    }
    public void setNonProxyHosts(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Allows the server startup to be skipped.
     *
     * @parameter expression="${maven.test.skip}" default-value="false"
     * @since 1.0-beta-2
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
     * @parameter expression="${plugin.artifactMap}"
     * @required
     * @readonly
     */
    private Map pluginArtifactMap = null;
    public Map getPluginArtifactMap() {
        throw new InternalError("Stubbed method");
    }
    public void setPluginArtifactMap(Map value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * List of System properties to pass to the selenium process.
     *
     * @parameter
     * @since 2.0
     */
    private Map systemProperties = null;
    public Map getSystemProperties() {
        throw new InternalError("Stubbed method");
    }
    public void setSystemProperties(Map value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Specify the option profilesLocation to selenium.
     * See selenium documentation
     *
     * @parameter expression="${profilesLocation}"
     * @since 2.0
     */
    private java.lang.String profilesLocation = null;
    public java.lang.String getProfilesLocation() {
        throw new InternalError("Stubbed method");
    }
    public void setProfilesLocation(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    public void execute() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Create the user-extensions.js file to use, or null if it should not be installed.
     */
    private File createUserExtensionsFile() {
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
