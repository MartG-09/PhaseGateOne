from unittest import TestCase

import two_sum

class two_sum_test(TestCase):

    def test_that_two_sum_exists(self):
        array= [8 , 6 , 12 , 4 , -2]
        number = 6
        two_sum.check_two_number(array , number)

    def test_that_two_sum_retuns_two_number(self):
        array= [8 , 6 , 12 , 4 , -2]
        number = 6
        expected = [-2 , 8]
        actual = two_sum.check_two_number(array , number)
        self.assertEqual(actual , expected)
