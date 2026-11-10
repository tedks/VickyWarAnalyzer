# Bazel war model target

`bazel build //:war_model` compiles the JDK-only war model. `bazel test //...`
checks naval battle classification and unit counts. Bazel 8.7.0 and
rules_java 9.9.0 are pinned, with remote JDK 21 executing Java 8 source.

The JavaFX GUI and its existing Maven commands remain separate. The Bazel
target deliberately excludes `Country.java`, which imports JavaFX.
