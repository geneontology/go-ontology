all:
	cd src/ontology && make all
%:
	cd src/ontology && make $*

go-build:
	docker build . -t go-build
