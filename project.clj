(defproject com.hortau/lacinia "1.0.1"
  :description "A GraphQL server implementation in Clojure"
  :url "https://github.com/hortau/lacinia"
  :license {:name "Apache, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :plugins [[lein-cloverage "1.2.2"]
            [test2junit "1.2.5"]]
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [clj-antlr "0.2.9"]
                 [org.flatland/ordered "1.5.9"]
                 [org.clojure/data.json "2.4.0"]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[criterium "0.4.6"]
                                  [org.clojure/core.async "1.3.618"]
                                  [expound "0.8.9"]
                                  [joda-time "2.10.10"]
                                  [com.walmartlabs/test-reporting "1.1"]
                                  [io.aviso/logging "1.0"]
                                  [io.pedestal/pedestal.log "0.5.8"]
                                  [org.clojure/test.check "1.1.0"]
                                  [org.clojure/data.csv "1.0.0"]
                                  [org.clojure/tools.cli "1.0.206"]]}}
  ;; Benchmarks and codox are now done via clj rather than lein; see deps.edn
  :jvm-opts ["-Xmx1g" "-XX:-OmitStackTraceInFastThrow"]
  :test2junit-output-dir ~(or (System/getenv "CIRCLE_TEST_REPORTS") "target/test2junit"))

