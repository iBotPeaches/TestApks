#!/usr/bin/env bash

rm -rf compiled.zip
rm -rf issue3366.apk

aapt2 compile --dir app/res -o compiled.zip -v

aapt2 link \
  --enable-compact-entries \
  --min-sdk-version 34 \
  --target-sdk-version 34 \
  -o issue3366.apk \
  --manifest app/AndroidManifest.xml \
  -I ~/.local/share/apktool/framework/1.apk \
  compiled.zip \
  -v
