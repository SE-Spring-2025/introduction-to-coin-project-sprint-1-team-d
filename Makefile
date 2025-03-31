JAVAC=javac
JAVA=java
SRC_DIR=src
BIN_DIR=bin
MAIN_DIR=$(SRC_DIR)/main/java
CLIENT_DIR=$(SRC_DIR)/client
CLASSES=$(BIN_DIR)/client Demo.class
OUTPUT_DIR=$(BIN_DIR)

all: compile run

compile:
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(MAIN_DIR)/*.java $(CLIENT_DIR)/*.java

run:
	$(JAVA) -cp $(BIN_DIR) client.Demo

clean:
	rm -rf $(BIN_DIR)/*.class
