<?php
/**
 * Plugin Name: Community Event Card
 * Description: AI-assisted learning example of a shortcode for a fictional event.
 */

if (!defined('ABSPATH')) {
    exit;
}

function wd_labs_community_event_card($attributes = array()) {
    $event = shortcode_atts(
        array('title' => 'Community coding evening', 'venue' => 'Example Library'),
        $attributes,
        'learning_event_card'
    );

    return '<article class="learning-event-card"><h2>'
        . esc_html($event['title'])
        . '</h2><p><strong>Venue:</strong> '
        . esc_html($event['venue'])
        . '</p></article>';
}

add_shortcode('learning_event_card', 'wd_labs_community_event_card');
