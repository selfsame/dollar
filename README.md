# dollar.bill
###a subset of jquery functions for the nostalgic cljs user

## usage

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