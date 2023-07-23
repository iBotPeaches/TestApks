#!/usr/bin/env bash

./gradlew assembleDebug

aapt2 optimize -o sparse.apk --enable-sparse-encoding app/build/outputs/apk/debug/app-debug.apk
cp app/build/outputs/apk/debug/app-debug.apk not-sparse.apk