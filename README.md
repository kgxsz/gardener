# Gardener

#### A simple tool for automating Garden builds.

## Setup
Add the following to your `deps.edn` file:
```
:aliases {:style {:extra-deps {gardener {:git/url "https://github.com/kgxsz/gardener"
                                         :sha "some-sha"}}
                  :main-opts ["--main" "gardener.compiler"
                              "--stylesheet" "your.project/stylesheet"
                              "--output-to" "path/to/your/file.css"
                              "--watch" "path/to/watch/for/change"
                              "--pretty-print" "true"]}
```

Then run `clj -Astyle` to get an auto reloading Garden flow going.

To build once: `clj --main gardener.compiler --stylesheet your.project/stylesheet --output-to path/to/your/file.css --build-once true`
