(ns kotoba.lsp.pos-gte
  "pos>= -- addressed on its own.

  Split out of kotoba.lang.lsp on 2026-09-09 (ADR-2609091200). The unit
  here is the DEFINITION, and this repo's deps.edn names exactly the
  definitions it reaches -- nothing else.
"
  )

(defn pos>= [a b]
  (or (> (:line a) (:line b))
      (and (= (:line a) (:line b))
           (>= (:character a) (:character b)))))
