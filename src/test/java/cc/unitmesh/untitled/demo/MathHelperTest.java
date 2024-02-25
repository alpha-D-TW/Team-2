package cc.unitmesh.untitled.demo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MathHelperTest {
    // 寻找两个正序数组的中位数
    // Given 两个数组分别为[1, 3]和[2]，When 寻找中位数，Then 中位数为2.0
    // Given 两个数组分别为[1, 2]和[3, 4]，When 寻找中位数，Then 中位数为2.5
    // Given 两个数组分别为[0, 0]和[0, 0]，When 寻找中位数，Then 中位数为0.0
    // Given 两个数组分别为[]和[1]，When 寻找中位数，Then 中位数为1.0
    @Test
    public void testFindMedianSortedArrays_case1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;
        double result = MathHelper.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMedianSortedArrays_case2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;
        double result = MathHelper.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMedianSortedArrays_case3() {
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        double expected = 0.0;
        double result = MathHelper.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMedianSortedArrays_case4() {
        int[] nums1 = {};
        int[] nums2 = {1};
        double expected = 1.0;
        double result = MathHelper.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result, 0.001);
    }

    // 删除链表的倒数第 N 个结点
    // Given 一个链表为 1->2->3->4->5，N 为 2，When 删除倒数第 2 个结点，Then 链表变为 1->2->3->5
    // Given 一个链表为 1->2->3->4->5，N 为 1，When 删除倒数第 1 个结点，Then 链表变为 1->2->3->4
    // Given 一个链表为 1，N 为 1，When 删除倒数第 1 个结点，Then 链表变为空链表
    @Test
    public void testRemoveNthFromEnd_case1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);
        ListNode result = MathHelper.deleteNthFromEnd(head, n);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveNthFromEnd_case2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 1;
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        ListNode result = MathHelper.deleteNthFromEnd(head, n);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveNthFromEnd_case3() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode expected = null;
        ListNode result = MathHelper.deleteNthFromEnd(head, n);
        assertEquals(expected, result);
    }

}
