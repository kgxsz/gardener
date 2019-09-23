# Gardener

#### A simple tool for automating Garden builds.

## Setup
Add the following to your `deps.edn` file:
```
:aliases {:gardener {:extra-deps {gardener {:git/url "https://github.com/kgxsz/gardener"
                                            :sha "some-sha"}}
                     :main-opts ["--main" "gardener.compiler"
                                 "--stylesheet" "your.project/stylesheet"
                                 "--output-to" "path/to/your/file.css"
                                 "--watch" "path/to/watch/for/change"
                                 "--pretty-print" "true"
                                 "--build-once" "false"]}
```

Then run `clj -Agardener` to get an auto reloading Garden flow going.
