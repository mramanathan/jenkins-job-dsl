pipelineJob('deveop-pipeline') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/jenkinsci/job-dsl-plugin.git')
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}
