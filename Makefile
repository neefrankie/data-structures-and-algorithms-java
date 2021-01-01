src_base_dir := src/main/java
jar_base_dir := build/jar

shell_sort := chapter7/shellsort
partition := chapter7/partition
quick_sort1 := chapter7/qs1
quick_sort2 := chapter7/qs2

.PHONY:
shellsort : jardir
	javac -d build/$(shell_sort) -verbose $(src_base_dir)/$(shell_sort)/*.java

	jar --create --verbose --file $(jar_base_dir)/shell-sort.jar --manifest $(src_base_dir)/$(shell_sort)/Manifest.txt -C build/$(shell_sort) .

part : jardir
	javac -d build/$(partition) -verbose $(src_base_dir)/$(partition)/*.java

	jar --create --verbose --file $(jar_base_dir)/partition.jar --manifest $(src_base_dir)/$(partition)/Manifest.txt -C build/$(partition) .

qsone : jardir
	javac -d build/$(quick_sort1) -verbose $(src_base_dir)/$(quick_sort1)/*.java

	jar --create --verbose --file $(jar_base_dir)/quick-sort1.jar --manifest $(src_base_dir)/$(quick_sort1)/Manifest.txt -C build/$(quick_sort1) .

qstwo : jardir
	javac -d build/$(quick_sort2) -verbose $(src_base_dir)/$(quick_sort2)/*.java

	jar --create --verbose --file $(jar_base_dir)/quick-sort2.jar --manifest $(src_base_dir)/$(quick_sort2)/Manifest.txt -C build/$(quick_sort2) .

jardir :
	mkdir -p $(jar_base_dir)

clean :
	rm -r build/**
