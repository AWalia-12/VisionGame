import pygame as pg

<<<<<<< Updated upstream
class Test:

    def __init__(self):

        #Game setup
        self.screen = pg.display.set_mode((800, 600))

        #Test metrics
        self.right = 0 #Number of right answers
        self.wrong = 0 #Number of wrong answers
        self.distance_at_second = [] #List of distances from screen, where the index is the second that it is collected at
        self.eye_position_at_second = []

        #Screen metrics
        self.screen_width = self.screen.get_width()
        self.screen_height = self.screen.get_height()
        self.screen_dims = {
            "height": self.screen_width, 
            "width": self.screen_height
        }

class Optotype:

    def __init__(self):
        self.width = 0
        self.length = 0
        self.color = ""
        self.optotype_List = []



#Game loop
while True:
    print("hello world")