src_base_dir := src/main/java
jar_base_dir := build/jar

triangle := chapter6/triangle
shell_sort := chapter7/shellsort
partition := chapter7/partition
quick_sort1 := chapter7/qs1
quick_sort2 := chapter7/qs2
binary_tree := chapter8/tree
hash_table := chapter11/hash

.PHONY:
triangle : jardir
	javac -d build/$(triangle) -verbose $(src_base_dir)/$(triangle)/*.java

	jar --create --verbose --file $(jar_base_dir)/triangle.jar --manifest $(src_base_dir)/$(triangle)/Manifest.txt -C build/$(triangle) .

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

bintree : jardir
	javac -d build/$(binary_tree) -verbose $(src_base_dir)/$(binary_tree)/*.java

	jar --create --verbose --file $(jar_base_dir)/binary-tree.jar --manifest $(src_base_dir)/$(binary_tree)/Manifest.txt -C build/$(binary_tree) .

hashtable : jardir
	javac -d build/$(hash_table) -verbose $(src_base_dir)/$(hash_table)/*.java
	jar --create --verbose --file $(jar_base_dir)/hash-table.jar --manifest $(src_base_dir)/$(hash_table)/Manifest.txt -C build/$(hash_table) .

jardir :
	mkdir -p $(jar_base_dir)

clean :
	rm -r build/**
