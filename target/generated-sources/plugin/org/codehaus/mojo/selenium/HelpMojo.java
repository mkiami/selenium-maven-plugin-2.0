package org.codehaus.mojo.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Display help information on selenium-maven-plugin.<br/> Call <pre>  mvn selenium:help -Ddetail=true -Dgoal=&lt;goal-name&gt;</pre> to display parameter details.
 *
 * @version generated on Mon Aug 22 11:34:17 CEST 2011
 * @author org.apache.maven.tools.plugin.generator.PluginHelpGenerator (version 2.7)
 * @goal help
 * @requiresProject false
 * @threadSafe
 */
public class HelpMojo
    extends AbstractMojo
{
    /**
     * If <code>true</code>, display all settable properties for each goal.
     * 
     * @parameter expression="${detail}" default-value="false"
     */
    private boolean detail;

    /**
     * The name of the goal for which to show help. If unspecified, all goals will be displayed.
     * 
     * @parameter expression="${goal}"
     */
    private java.lang.String goal;

    /**
     * The maximum length of a display line, should be positive.
     * 
     * @parameter expression="${lineLength}" default-value="80"
     */
    private int lineLength;

    /**
     * The number of spaces per indentation level, should be positive.
     * 
     * @parameter expression="${indentSize}" default-value="2"
     */
    private int indentSize;


    /** {@inheritDoc} */
    public void execute()
        throws MojoExecutionException
    {
        if ( lineLength <= 0 )
        {
            getLog().warn( "The parameter 'lineLength' should be positive, using '80' as default." );
            lineLength = 80;
        }
        if ( indentSize <= 0 )
        {
            getLog().warn( "The parameter 'indentSize' should be positive, using '2' as default." );
            indentSize = 2;
        }

        StringBuffer sb = new StringBuffer();

        append( sb, "org.codehaus.mojo:selenium-maven-plugin:2.0.1-SNAPSHOT", 0 );
        append( sb, "", 0 );

        append( sb, "Maven Selenium Plugin", 0 );
        append( sb, "Support for using Selenium with Maven 2/3.", 1 );
        append( sb, "", 0 );

        if ( goal == null || goal.length() <= 0 )
        {
            append( sb, "This plugin has 5 goals:", 0 );
            append( sb, "", 0 );
        }

        if ( goal == null || goal.length() <= 0 || "help".equals( goal ) )
        {
            append( sb, "selenium:help", 0 );
            append( sb, "Display help information on selenium-maven-plugin.\nCall\n\u00a0\u00a0mvn\u00a0selenium:help\u00a0-Ddetail=true\u00a0-Dgoal=<goal-name>\nto display parameter details.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "detail (Default: false)", 2 );
                append( sb, "If true, display all settable properties for each goal.", 3 );
                append( sb, "Expression: ${detail}", 3 );
                append( sb, "", 0 );

                append( sb, "goal", 2 );
                append( sb, "The name of the goal for which to show help. If unspecified, all goals will be displayed.", 3 );
                append( sb, "Expression: ${goal}", 3 );
                append( sb, "", 0 );

                append( sb, "indentSize (Default: 2)", 2 );
                append( sb, "The number of spaces per indentation level, should be positive.", 3 );
                append( sb, "Expression: ${indentSize}", 3 );
                append( sb, "", 0 );

                append( sb, "lineLength (Default: 80)", 2 );
                append( sb, "The maximum length of a display line, should be positive.", 3 );
                append( sb, "Expression: ${lineLength}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "selenese".equals( goal ) )
        {
            append( sb, "selenium:selenese", 0 );
            append( sb, "Run a suite of HTML Selenese tests.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "browser", 2 );
                append( sb, "The browser name to run; must be one of the standard valid browser names (and must start with a *), e.g. *firefox, *iexplore, *custom.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "multiWindow (Default: false)", 2 );
                append( sb, "True if the application under test should run in its own window, false if the AUT will run in an embedded iframe.", 3 );
                append( sb, "", 0 );

                append( sb, "port (Default: 4444)", 2 );
                append( sb, "The port on which we\'ll run the Selenium Server.", 3 );
                append( sb, "", 0 );

                append( sb, "results", 2 );
                append( sb, "The file to which we\'ll write out our test results.", 3 );
                append( sb, "", 0 );

                append( sb, "skip (Default: false)", 2 );
                append( sb, "Allows the tests to be skipped.", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "slowResources (Default: false)", 2 );
                append( sb, "A debugging tool that slows down the Selenium Server. (Selenium developers only)", 3 );
                append( sb, "", 0 );

                append( sb, "startURL", 2 );
                append( sb, "The base URL on which the tests will be run, e.g. http://www.google.com. Note that only the hostname part of this URL will really be used.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "suite", 2 );
                append( sb, "The suite file to run.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "timeoutInSeconds (Default: 1800)", 2 );
                append( sb, "Amount of time to wait before we just kill the browser.", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "start-server".equals( goal ) )
        {
            append( sb, "selenium:start-server", 0 );
            append( sb, "Start the Selenium server.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "avoidProxy (Default: false)", 2 );
                append( sb, "By default, we proxy every browser request; set this flag to make the browser use our proxy only for URLs containing \'/selenium-server\'", 3 );
                append( sb, "Expression: ${avoidProxy}", 3 );
                append( sb, "", 0 );

                append( sb, "background (Default: false)", 2 );
                append( sb, "Flag to control if we background the server or block Maven execution.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: ${background}", 3 );
                append( sb, "", 0 );

                append( sb, "browserSessionReuse (Default: false)", 2 );
                append( sb, "Stops re-initialization and spawning of the browser between tests.", 3 );
                append( sb, "Expression: ${browserSessionReuse}", 3 );
                append( sb, "", 0 );

                append( sb, "browserSideLog", 2 );
                append( sb, "Enables logging on the browser side; logging messages will be transmitted to the server. This can affect performance.", 3 );
                append( sb, "Expression: ${browserSideLog}", 3 );
                append( sb, "", 0 );

                append( sb, "debug (Default: false)", 2 );
                append( sb, "Enable the server\'s debug mode..", 3 );
                append( sb, "Expression: ${debug}", 3 );
                append( sb, "", 0 );

                append( sb, "defaultUserExtensions (Default: org/codehaus/mojo/selenium/default-user-extensions.js)", 2 );
                append( sb, "The file or resource to use for default user-extensions.js.", 3 );
                append( sb, "", 0 );

                append( sb, "defaultUserExtensionsEnabled (Default: true)", 2 );
                append( sb, "Enable or disable default user-extensions.js", 3 );
                append( sb, "", 0 );

                append( sb, "displayPropertiesFile (Default: ${project.build.directory}/selenium/display.properties)", 2 );
                append( sb, "The location of the file to read the display properties.", 3 );
                append( sb, "", 0 );

                append( sb, "ensureCleanSession (Default: false)", 2 );
                append( sb, "If the browser does not have user profiles, make sure every new session has no artifacts from previous sessions. For example, enabling this option will cause all user cookies to be archived before launching IE, and restored after IE is closed.", 3 );
                append( sb, "Expression: ${ensureCleanSession}", 3 );
                append( sb, "", 0 );

                append( sb, "firefoxProfileTemplate", 2 );
                append( sb, "Normally a fresh empty Firefox profile is created every time we launch. You can specify a directory to make us copy your profile directory instead.", 3 );
                append( sb, "Expression: ${firefoxProfileTemplate}", 3 );
                append( sb, "", 0 );

                append( sb, "forcedBrowserMode", 2 );
                append( sb, "Sets the browser mode (e.g. \'*iexplore\' for all sessions).", 3 );
                append( sb, "Expression: ${forcedBrowserMode}", 3 );
                append( sb, "", 0 );

                append( sb, "logFile (Default: ${project.build.directory}/selenium/server.log)", 2 );
                append( sb, "The file that Selenium server logs will be written to.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: ${logFile}", 3 );
                append( sb, "", 0 );

                append( sb, "logOutput (Default: false)", 2 );
                append( sb, "Enable logging mode.", 3 );
                append( sb, "Expression: ${logOutput}", 3 );
                append( sb, "", 0 );

                append( sb, "nonProxyHosts", 2 );
                append( sb, "Configure the Selenium Server to use http.nonProxyHosts.", 3 );
                append( sb, "Expression: ${nonProxyHosts}", 3 );
                append( sb, "", 0 );

                append( sb, "port (Default: 4444)", 2 );
                append( sb, "The port number of the server to connect to.", 3 );
                append( sb, "Expression: ${port}", 3 );
                append( sb, "", 0 );

                append( sb, "profilesLocation", 2 );
                append( sb, "Specify the option profilesLocation to selenium. See selenium documentation", 3 );
                append( sb, "Expression: ${profilesLocation}", 3 );
                append( sb, "", 0 );

                append( sb, "proxyHost", 2 );
                append( sb, "Configure the Selenium Server to use http.proxyHost.", 3 );
                append( sb, "Expression: ${proxyHost}", 3 );
                append( sb, "", 0 );

                append( sb, "proxyPort", 2 );
                append( sb, "Configure the Selenium Server to use http.proxyPort.", 3 );
                append( sb, "Expression: ${proxyPort}", 3 );
                append( sb, "", 0 );

                append( sb, "singleWindow (Default: false)", 2 );
                append( sb, "Puts you into a mode where the test web site executes in a frame. This mode should only be selected if the application under test does not use frames.", 3 );
                append( sb, "Expression: ${singleWindow}", 3 );
                append( sb, "", 0 );

                append( sb, "skip (Default: false)", 2 );
                append( sb, "Allows the server startup to be skipped.", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "systemProperties", 2 );
                append( sb, "List of System properties to pass to the selenium process.", 3 );
                append( sb, "", 0 );

                append( sb, "timeout (Default: -1)", 2 );
                append( sb, "Timeout for the server in seconds.", 3 );
                append( sb, "Expression: ${timeout}", 3 );
                append( sb, "", 0 );

                append( sb, "trustAllSSLCertificates (Default: false)", 2 );
                append( sb, "Forces the Selenium proxy to trust all SSL certificates. This doesn\'t work in browsers that don\'t use the Selenium proxy.", 3 );
                append( sb, "Expression: ${trustAllSSLCertificates}", 3 );
                append( sb, "", 0 );

                append( sb, "trustStore", 2 );
                append( sb, "The location of the SSL trust-store.", 3 );
                append( sb, "Expression: ${trustStore}", 3 );
                append( sb, "", 0 );

                append( sb, "trustStorePassword", 2 );
                append( sb, "The password for the SSL trust-store.", 3 );
                append( sb, "Expression: ${trustStorePassword}", 3 );
                append( sb, "", 0 );

                append( sb, "userExtensions", 2 );
                append( sb, "Location of the user-extensions.js to load into the server. If defaultUserExtensionsEnabled is true, then this file will be appended to the defaults.", 3 );
                append( sb, "Expression: ${userExtensions}", 3 );
                append( sb, "", 0 );

                append( sb, "verifyBrowser", 2 );
                append( sb, "Attempt to verify the named browser configuration. Must be one of the standard valid browser names (and must start with a *), e.g. *firefox, *iexplore, *custom.", 3 );
                append( sb, "Expression: ${verifyBrowser}", 3 );
                append( sb, "", 0 );

                append( sb, "workingDirectory", 2 );
                append( sb, "Working directory where Selenium server will be started from.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: ${project.build.directory}/selenium", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "stop-server".equals( goal ) )
        {
            append( sb, "selenium:stop-server", 0 );
            append( sb, "Stop the Selenium server.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "port (Default: 4444)", 2 );
                append( sb, "The port number of the server to connect to.", 3 );
                append( sb, "Expression: ${port}", 3 );
                append( sb, "", 0 );

                append( sb, "skip (Default: false)", 2 );
                append( sb, "Skip goal execution", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "xvfb".equals( goal ) )
        {
            append( sb, "selenium:xvfb", 0 );
            append( sb, "Starts an Xvfb instance suitable for handling X11 displays for headless systems. Use this in combonation with the start-server goal to allow browsers to be launched on headless unix systems.\nOptionally uses \'xauth\' to setup authentication for the Xvfb instance to allow running tests using the frame buffer server when another X server is already running.\n", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "authenticationFile", 2 );
                append( sb, "The file where X authentication data is stored for the Xvfb session. Default is to generate a temporary file.", 3 );
                append( sb, "", 0 );

                append( sb, "background (Default: true)", 2 );
                append( sb, "Flag to control if we background the process or block Maven execution.", 3 );
                append( sb, "", 0 );

                append( sb, "display", 2 );
                append( sb, "The X11 display to use. Default value is :20.", 3 );
                append( sb, "", 0 );

                append( sb, "displayPropertiesFile (Default: ${project.build.directory}/selenium/display.properties)", 2 );
                append( sb, "The location of the file to write the display properties which will be picked up by the start-server goal.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "logFile (Default: ${project.build.directory}/selenium/xvfb.log)", 2 );
                append( sb, "The file that Xvfb output will be written to.", 3 );
                append( sb, "", 0 );

                append( sb, "logOutput (Default: true)", 2 );
                append( sb, "Enable logging mode.", 3 );
                append( sb, "", 0 );

                append( sb, "options", 2 );
                append( sb, "A list of additional options to pass to the Xvfb process.", 3 );
                append( sb, "", 0 );

                append( sb, "reuse (Default: false)", 2 );
                append( sb, "Reuse Xvfb process", 3 );
                append( sb, "Expression: ${xvfb.reuse}", 3 );
                append( sb, "", 0 );

                append( sb, "skip (Default: false)", 2 );
                append( sb, "Skip goal execution", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "xauthEnabled (Default: true)", 2 );
                append( sb, "Use \'xauth\' to setup permissions for the Xvfb server. This requires \'xauth\' be installed and may be required when an X server is already running.", 3 );
                append( sb, "", 0 );

                append( sb, "xauthExecutable (Default: xauth)", 2 );
                append( sb, "The \'xauth\' command to execute.", 3 );
                append( sb, "", 0 );

                append( sb, "xauthProtocol (Default: .)", 2 );
                append( sb, "The \'xauth\' protocol.", 3 );
                append( sb, "", 0 );

                append( sb, "xvfbExecutable (Default: Xvfb)", 2 );
                append( sb, "The \'Xvfb\' command to execute.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );
            }
        }

        if ( getLog().isInfoEnabled() )
        {
            getLog().info( sb.toString() );
        }
    }

    /**
     * <p>Repeat a String <code>n</code> times to form a new string.</p>
     *
     * @param str String to repeat
     * @param repeat number of times to repeat str
     * @return String with repeated String
     * @throws NegativeArraySizeException if <code>repeat < 0</code>
     * @throws NullPointerException if str is <code>null</code>
     */
    private static String repeat( String str, int repeat )
    {
        StringBuffer buffer = new StringBuffer( repeat * str.length() );

        for ( int i = 0; i < repeat; i++ )
        {
            buffer.append( str );
        }

        return buffer.toString();
    }

    /** 
     * Append a description to the buffer by respecting the indentSize and lineLength parameters.
     * <b>Note</b>: The last character is always a new line.
     * 
     * @param sb The buffer to append the description, not <code>null</code>.
     * @param description The description, not <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     */
    private void append( StringBuffer sb, String description, int indent )
    {
        for ( Iterator it = toLines( description, indent, indentSize, lineLength ).iterator(); it.hasNext(); )
        {
            sb.append( it.next().toString() ).append( '\n' );
        }
    }

    /** 
     * Splits the specified text into lines of convenient display length.
     * 
     * @param text The text to split into lines, must not be <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     * @return The sequence of display lines, never <code>null</code>.
     * @throws NegativeArraySizeException if <code>indent < 0</code>
     */
    private static List toLines( String text, int indent, int indentSize, int lineLength )
    {
        List lines = new ArrayList();

        String ind = repeat( "\t", indent );
        String[] plainLines = text.split( "(\r\n)|(\r)|(\n)" );
        for ( int i = 0; i < plainLines.length; i++ )
        {
            toLines( lines, ind + plainLines[i], indentSize, lineLength );
        }

        return lines;
    }

    /** 
     * Adds the specified line to the output sequence, performing line wrapping if necessary.
     * 
     * @param lines The sequence of display lines, must not be <code>null</code>.
     * @param line The line to add, must not be <code>null</code>.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     */
    private static void toLines( List lines, String line, int indentSize, int lineLength )
    {
        int lineIndent = getIndentLevel( line );
        StringBuffer buf = new StringBuffer( 256 );
        String[] tokens = line.split( " +" );
        for ( int i = 0; i < tokens.length; i++ )
        {
            String token = tokens[i];
            if ( i > 0 )
            {
                if ( buf.length() + token.length() >= lineLength )
                {
                    lines.add( buf.toString() );
                    buf.setLength( 0 );
                    buf.append( repeat( " ", lineIndent * indentSize ) );
                }
                else
                {
                    buf.append( ' ' );
                }
            }
            for ( int j = 0; j < token.length(); j++ )
            {
                char c = token.charAt( j );
                if ( c == '\t' )
                {
                    buf.append( repeat( " ", indentSize - buf.length() % indentSize ) );
                }
                else if ( c == '\u00A0' )
                {
                    buf.append( ' ' );
                }
                else
                {
                    buf.append( c );
                }
            }
        }
        lines.add( buf.toString() );
    }

    /** 
     * Gets the indentation level of the specified line.
     * 
     * @param line The line whose indentation level should be retrieved, must not be <code>null</code>.
     * @return The indentation level of the line.
     */
    private static int getIndentLevel( String line )
    {
        int level = 0;
        for ( int i = 0; i < line.length() && line.charAt( i ) == '\t'; i++ )
        {
            level++;
        }
        for ( int i = level + 1; i <= level + 4 && i < line.length(); i++ )
        {
            if ( line.charAt( i ) == '\t' )
            {
                level++;
                break;
            }
        }
        return level;
    }
}
