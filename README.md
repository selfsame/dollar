##subset of jquery functions for the nostalgic cljs user

leiningen
```clj
[selfsame/dollar "0.0.9-SNAPSHOT"]
```

```clj
(ns user
  (:require [dollar.bill :as $ :refer [$]]))
```

### query

```clj
($ "div#main .icon")
```

### construct

```clj
($ "<span class='disabled'>foo</span>")
```


_see bill.cljs for implemented fns_