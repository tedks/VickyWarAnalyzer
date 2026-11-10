# Bazel war model target

Use Bazelisk to select Bazel 8.7.0 from `.bazelversion`. `bazel build
//:war_model` compiles the JDK-only war model. `bazel test //...` checks
naval and land classification and unit counts. rules_java 9.9.0 is pinned;
remote JDK 21 compiles Java 8 source syntax. This does not establish Java 8
standard-library compatibility.

The JavaFX GUI and its existing Maven commands remain separate. The Bazel
target deliberately excludes `Country.java`, which imports JavaFX.
