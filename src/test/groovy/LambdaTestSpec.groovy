import geb.spock.GebReportingSpec

class LambdaTestSpec extends GebReportingSpec {

    def "Open LambdaTest"() {
        when:
        to LambdaTestPage

        then:
        waitFor { at LambdaTestResultPage }

    }

}

