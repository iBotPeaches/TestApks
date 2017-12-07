DIRECTORIES := $(wildcard */)

all: $(DIRECTORIES)

build:
	mkdir output;
	for dir in $(DIRECTORIES); do \
	   cd $$dir; ./gradlew assembleDebug; cd ..; \
	done

clean:
	rm -rf output;
	for dir in $(DIRECTORIES); do \
	   cd $$dir; ./gradlew clean; cd ..; \
	done
