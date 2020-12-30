src_base_dir := src/main/java
jar_base_dir := build/jar

shell_sort := chapter7/shellsort
quick_sort2 := chapter7/qs2

.PHONY:
shellsort : jardir
	javac -d build/$(shell_sort) -verbose $(src_base_dir)/$(shell_sort)/*.java

	jar --create --verbose --file $(jar_base_dir)/shell-sort.jar --manifest $(src_base_dir)/$(shell_sort)/Manifest.txt -C build/$(shell_sort) .

qstwo : jardir
	javac -d build/$(quick_sort2) -verbose $(src_base_dir)/$(quick_sort2)/*.java

	jar --create --verbose --file $(jar_base_dir)/quick-sort2.jar --manifest $(src_base_dir)/$(quick_sort2)/Manifest.txt -C build/$(quick_sort2) .

jardir :
	mkdir -p $(jar_base_dir)

clean :
	rm -r build/**
