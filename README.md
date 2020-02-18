# second-chance-page-replacment-algorithm
 In a computer operating system that uses paging for virtual memory management
 , page replacement algorithms decide which memory pages to page out, sometimes called swap out, or write to disk, 
 when a page of memory needs to be allocated. Page replacement happens when a requested page is not in memory (page fault)old.  When the page that was selected for replacement and paged out is referenced again it has to be paged in (read in from disk), and this involves waiting for I/O completion. This determines the quality of the page replacement algorithm: the less time waiting for page-ins, the better the algorithm. A page replacement algorithm looks at the limited information about accesses to the pages provided by hardware, and tries to guess which pages should be replaced to minimize the total number of page misses, while balancing this with the costs (primary storage and processor time) of the algorithm itself. 
