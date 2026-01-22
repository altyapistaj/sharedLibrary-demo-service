def call(String JOB_NAME){
    return [
            projectName : 'demo-service-test',
            jobName : JOB_NAME.tokenize('/')[1],
            branch : "library-dependency",
            pom : 'pom.xml',

            organizationName : "altyapistaj",

            customWorkspace : "/",
            gitAdressAndName : JOB_NAME.tokenize('/')[1]
    ]

}

