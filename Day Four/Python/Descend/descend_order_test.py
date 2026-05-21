from unittest import TestCase

import descend_order

class descend_order_test(TestCase):

    def test_that_descend_order_exists(self):
        array= [12 , 3 , 2 , 9 , 3 , 14 , 10]
        descend_order.descend(array)

    def test_that_descend_order_retuns_two_number(self):
        array= [12 , 3 , 2 , 9 , 3 , 14 , 10]
        expected = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        actual = descend_order.descend(array)
        self.assertEqual(actual , expected)
