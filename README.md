# Circle eater

This project is meant only to explore using [ring](https://github.com/mmcgrana/ring), [compojure](https://github.com/weavejester/compojure), [clj-http](https://github.com/dakrone/clj-http) and [cheshire] together with [amon-log](https://github.com/dakrone/cheshire) to record data.

Build with `lein deps`, run with `lein run`

It has no practical purpose other than learning.

Circle eater searches for data it generates and passes it to amon.There is a timer cycling every n seconds which makes clj-http requests at a randomized endpoint on its own host, which it catches in turn and returns randomly generated json data as a response. It then logs that data to a local amon instance.

## Usage

Why on earth would you ever want to use this

## License

Copyright (C) 2012 Thomas Omans

Distributed under the WTFYW License
