# matchcolor

A server-side Node.js app written in ClojureScript to find the match or the closest match to a hexcolor/

## Why?

This was mainly an experiment in developing a simple web application in ClojureScript, using ClojureScript as the server-side language and Node.js as the runtime.

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
