# Gardener

#### A simple tool for automating Garden builds.

## Setup
- Add the following to your `deps.edn` file:
  ```
  :deps {gardener {:git/url "https://github.com/kgxsz/gardener"
                   :sha "some-sha"}
  :aliases {:gardener-dev {:main-opts ["--main" "gardener.compiler"
                                       "--stylesheet" "your.project/stylesheet"
                                       "--output-to" "path/to/your/file.css"
                                       "--watch" "path/to/watch/for/change"
                                       "--pretty-print" "true"]}
            :gardener-prod {:main-opts ["--main" "gardener.compiler"
                                        "--stylesheet" "your.project/stylesheet"
                                        "--output-to" "path/to/your/file.css"
                                        "--build-once" "true"]}}
  ```

- Run `clj -Agardener-dev` to get an auto reloading Garden flow going.
- Run `clj -Agardener-prod` to build an optimised stylesheet once.
