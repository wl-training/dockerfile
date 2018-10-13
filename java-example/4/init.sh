#!/bin/sh

echo "Version used is $VERSION"
echo "Running java..."
java -cp . Hello $*
