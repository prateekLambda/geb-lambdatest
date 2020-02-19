/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

def lambdaTestBrowser = System.getProperty("geb.lambdatest.browser")
println(lambdaTestBrowser);

if (lambdaTestBrowser) {
    driver = {
        def username = System.getenv("GEB_LAMBDATEST_USERNAME")
        assert username
        def accessKey = System.getenv("GEB_LAMBDATEST_AUTHKEY")
        assert accessKey

        final url = "https://${username}:${accessKey}@hub.lambdatest.com/wd/hub"
        println(url)
        caps = new DesiredCapabilities()
        caps.setCapability(CapabilityType.PLATFORM_NAME,"win10")
        caps.setCapability(CapabilityType.BROWSER_NAME,"firefox")
        caps.setCapability(CapabilityType.BROWSER_VERSION,"latest")
        caps.setCapability("build", "geb-lambdatest")
        def tunnelName = System.getenv("GEB_LAMBDATEST_TUNNELID")
        if(tunnelName != "null"){
            caps.setCapability("tunnel", "true")
            caps.setCapability("tunnelName", tunnelName)
        }
        println(caps)
        new RemoteWebDriver(new URL(url), caps)
    }
}

//Default browser to run on local machine
environments {

    firefox {
        driver = { new FirefoxDriver() }
    }

    chrome {
        driver = { new ChromeDriver() }
    }

}