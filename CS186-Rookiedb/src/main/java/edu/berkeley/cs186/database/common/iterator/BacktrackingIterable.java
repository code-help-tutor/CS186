WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package edu.berkeley.cs186.database.common.iterator;

public interface BacktrackingIterable<T> extends Iterable<T> {
    @Override
    BacktrackingIterator<T> iterator();
}
