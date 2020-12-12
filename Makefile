src_base_dir := src/main/java
jar_base_dir := build/jar

shell_sort := chapter7/shellsort

.PHONY:
shellsort : jardir
	javac -d build/$(shell_sort) -verbose $(src_base_dir)/$(shell_sort)/*.java

	jar --create --verbose --file $(jar_base_dir)/shell-sort.jar --manifest $(src_base_dir)/$(shell_sort)/Manifest.txt -C build/$(shell_sort) .

jardir :
	mkdir $(jar_base_dir)

clean :
	rm -r build/**
