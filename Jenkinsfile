pipeline {
	agent any
	stages {
		stage('build') {
			steps {
				withEnv(["MAJOR_VERSION=1"])
				sh 'ant -f build.xml -v'
			}
		}
	}
	
	post {
		always {
			archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
		}
	}
}
