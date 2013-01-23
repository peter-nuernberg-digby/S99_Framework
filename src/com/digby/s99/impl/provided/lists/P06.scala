package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP06

object P06 extends AbstractP06 {

    // In theory, we could be slightly more efficient than this.  This approach
    // traverses the list twice: once to reverse it, and once to check equality.
    // Technically, we only need to check the first half of the list for equality
    // with the first half of the reversed list.  The code to do that more
    // efficiently than this implementation is much more complicated, so we'll
    // leave things with this clear and concise implementation.
    override def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
}