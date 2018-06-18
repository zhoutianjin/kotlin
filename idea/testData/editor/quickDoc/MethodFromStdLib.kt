fun test() {
    listOf(1, 2, 4).<caret>filter { it > 0 }
}

//INFO: <div class='definition'><pre><a href="psi_element://kotlin.collections"><code>kotlin.collections</code></a> (CollectionsKt.class)<br><b>public</b> <b>inline</b> <b>fun</b> &lt;T&gt; <a href="psi_element://kotlin.collections.Iterable">Iterable</a>&lt;<a href="psi_element://kotlin.collections.filter.T">T</a>&gt;.filter(
//INFO:     predicate: (<a href="psi_element://kotlin.collections.filter.T">T</a>) &rarr; Boolean
//INFO: ): <a href="psi_element://kotlin.collections.List">List</a>&lt;<a href="psi_element://kotlin.collections.filter.T">T</a>&gt;</pre></div><div class='content'><p>Returns a list containing only elements matching the given <a href="psi_element://predicate">predicate</a>.</p></div><table class='sections'></table>
