/*
 * FreshTomato.h
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#ifndef FRESHTOMATO_H_
#define FRESHTOMATO_H_

#include "TopingDecorator.h"

class FreshTomato: public TopingDecorator {
private:
	Pizza *component_;
	string name = " fresh tomato ";
	int cost = 193;
public:
	FreshTomato(Pizza *component);
	int getCost() const override;
	string getName() const override;
	string getDescription() const override;
};

#endif /* FRESHTOMATO_H_ */
