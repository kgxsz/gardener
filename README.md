# Gardener

#### A simple tool for automating Garden builds.

## Setup
Add the following to your `deps.edn` file:
```
:aliases {:style {:extra-deps {gardener {:git/url "https://github.com/kgxsz/gardener" :sha
                                         :sha "SOME_SHA"}}
                  :main-opts ["--main" "gardener.compiler"
                              "--stylesheet" "your.project/stylesheet"
                              "--output-to" "path/to/your/css/file.css"
                              "--watch" "path/to/watch/for/change"
                              "--pretty-print" "true"
                              "--build-once" "false"]}
```

Then run `clj -Astyle` to get an auto reloading Garden flow going.
