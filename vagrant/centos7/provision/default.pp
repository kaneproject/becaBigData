class { eclipse:
  ensure  => 'present',
  version => 'R',
  release => 'neon',
}
class { "maven::maven":
  version => "3.5.0", # version to install
  # you can get Maven tarball from a Maven repository instead than from Apache servers, optionally with a user/password
  repo => {
    #url => "http://repo.maven.apache.org/maven2",
    #username => "",
    #password => "",
  }
}
