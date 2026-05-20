from unittest import TestCase

import fire_drill_one

class fire_drill_one_test(TestCase):
    def test_that_fire_drill_one_exists(self):
        array = []
        fire_drill_one.display_test(array)
        

    def test_that_empty_array_returns_the_right_text(self):
        array = []
        actual = fire_drill_one.display_test(array)
        expected = "no one likes this"
        self.assertEqual(actual , expected)

    def test_that_array_with_one_element_returns_the_right_text(self):
        array = ["peter"]
        actual = fire_drill_one.display_test(array)
        expected = "peter likes this"
        self.assertEqual(actual , expected)

    def test_that_array_with_two_element_returns_the_right_text(self):
        array = ["Jacob" , "Alex"]
        actual = fire_drill_one.display_test(array)
        expected = "Jacob and Alex likes this"
        self.assertEqual(actual , expected)

    def test_that_array_with_three_element_returns_the_right_text(self):
        array = ["Jacob" , "Alex" , "Max"]
        actual = fire_drill_one.display_test(array)
        expected = "Jacob, Alex and Max likes this"
        self.assertEqual(actual , expected)

    def test_that_array_with_more_than_three_element_returns_the_right_text(self):
        array = ["Jacob" , "Alex" , "Max" , "Mark" , "John"]
        actual = fire_drill_one.display_test(array)
        expected = "Jacob, Alex and 3 others likes this"
        self.assertEqual(actual , expected)






