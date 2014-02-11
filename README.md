# matchcolor

A server-side Node.js app written in ClojureScript to find the match or the closest match to a hexcolor.

## Why?

This was mainly an experiment in developing a simple web application in ClojureScript, using ClojureScript as the server-side language and Node.js as the runtime.

It uses [express](https://github.com/visionmedia/express), [hiccups](https://github.com/teropa/hiccups) for views, [logfmt](https://github.com/kr/logfmt) for logging, and [garden](https://github.com/noprompt/garden) for the hex<->rgb conversions it provides.

The massive color lists comes from [Wikipedia](http://en.wikipedia.org/wiki/Lists_of_colors).

Layout is one of the [Bootstrap examples](http://getbootstrap.com/getting-started/#examples).

## Building and Running

1. `lein deps`
2. `lein cljsbuild once`
3. `npm install`
4. `cd target && node cljsbuild-main.js`

The app will be accessible on port 3000.

# Deployment

It's already setup for deployment to heroku. Move the compiled `cljsbuild-main.js` to `deploy` and then push to heroku.


## License

Copyright © 2014 Sean Brewer

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
