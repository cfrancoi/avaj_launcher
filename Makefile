.SUFFIXES: .java .class

SRCS = 	./src/weather/EWeather.java \
			./src/weather/Coordinates.java \
			./src/weather/WeatherProvider.java \
			./src/weather/WeatherTower.java \
			./src/weather/Tower.java \
			./src/Simulator.java \
			./src/vehicules/JetPlane.java \
			./src/vehicules/Flyable.java \
			./src/vehicules/Helicopter.java \
			./src/vehicules/Baloon.java \
			./src/vehicules/Aircraft.java \
			./src/vehicules/AircraftFactory.java

CLASS = $(SRCS:.java=.class)

JFLAGS = -g
JC = javac

compile:
	@echo "Compiling ..."
	@$(JC) $(JFLAGS) $(SRCS)
	
all: compile

clean:
	$(RM) $(CLASS)
	$(RM) sources.txt


build:
	find * -name "*.java" > sources.txt
	javac @sources.txt

.PHONY: compile all build
	