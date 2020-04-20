pipeline {
	agent any;
	tools {
		jdk 'jdk-1.8'
		ant 'ant-1.10'
	}
	environment {
	    BUILDFILE = "build.xml"
	}
	stages {
	    stage('Build') {
	    	steps {
	    		 sh label: 'Build with Apache Ant', script: "ant -f $BUILDFILE main"   
	    	}
	    }
	    stage('Unit Test') {
	    	steps {
	    	    sh  label: 'Unit test with Apache Ant', script: "ant -f $BUILDFILE test"
	    	    junit '**/TEST-*.xml'
	    	}
	    }
	}
}