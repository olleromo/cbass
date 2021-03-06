(defproject cbass "0.1.6-SNAPSHOT"
  :description "adding simple to HBase"
  :url "https://github.com/tolitius/cbass"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src" "src/cbass"]
  :java-source-paths ["src/java"]

  :dependencies [[org.apache.hbase/hbase-client "1.1.1"]
                 [aesahaettr "0.1.2" :exclusions [com.google.guava/guava]]
                 [com.taoensso/nippy "2.9.0"]
                 [org.clojure/clojure "1.8.0"]]

  :repositories {"cloudera"
                 {:url "https://repository.cloudera.com/artifactory/cloudera-repos"}})
